package pl.dedio.recyclerbugexample

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.cell_recycler.view.*

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(position: Int) {
        with(itemView) {
            cellText.text = (position + 1).toString()
        }
    }
}