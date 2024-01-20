package om.androidbook.medicine4

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface KakaoAPI {
    @GET("v2/local/search/keyword.json")    // Keyword.json의 정보를 받아옴
    fun getSearchKeyword(
        @Header("Authorization") key: String,     // 카카오 API 인증키 [필수]
        @Query("query") query: String,            // 검색을 원하는 질의어 [필수]
        @Query("page") page: Int,                   // 결과 페이지 번호
        @Query("radius") radius: Int,
        @Query("x") longitude: Double,  // 경도 파라미터 추가
        @Query("y") latitude: Double    // 위도 파라미터 추가
    ): Call<ResultSearchKeyword>    // 받아온 정보가 ResultSearchKeyword 클래스의 구조로 담김
}