package pl.dedio.recyclerbugexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = Adapter()
        adapter.items = createItems()

        with(mainRecycler) {
            this.adapter = adapter
            layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.HORIZONTAL, false)

            val itemDecoration = createDivider()
            addItemDecoration(itemDecoration)

            val snapHelper = LinearSnapHelper()
            snapHelper.attachToRecyclerView(this)
        }
    }

    private fun createItems() = listOf(Any(), Any(), Any(), Any(), Any(), Any(), Any(), Any())

    private fun createDivider(): DividerItemDecoration {
        val decoration = DividerItemDecoration(this, RecyclerView.HORIZONTAL)

        val drawable = ContextCompat.getDrawable(this, R.drawable.recycler_divider)!!
        decoration.setDrawable(drawable)

        return decoration
    }
}