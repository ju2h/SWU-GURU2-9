import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import om.androidbook.medicine4.DBHelper
import om.androidbook.medicine4.R
import om.androidbook.medicine4.SearchHistoryAdapter

class SharedHistoryActivity : AppCompatActivity() {

    private lateinit var dbHelper: DBHelper
    private lateinit var recyclerView: RecyclerView
    private lateinit var searchHistoryAdapter: SearchHistoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medicinelist)

        dbHelper = DBHelper(this, null, null, 1) // DBHelper 인스턴스 생성

        // RecyclerView 초기화
        recyclerView = findViewById(R.id.serchView)
        recyclerView.layoutManager = LinearLayoutManager(this)


    }
}
