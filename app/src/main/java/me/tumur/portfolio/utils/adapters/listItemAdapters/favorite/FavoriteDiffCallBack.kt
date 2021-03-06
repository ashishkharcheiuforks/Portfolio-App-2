package me.tumur.portfolio.utils.adapters.listItemAdapters.favorite

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil
import me.tumur.portfolio.repository.database.model.favorite.FavoriteModel

/**
 * Callback for calculating the diff between two non-null items in a list.
 *
 * Used by ListAdapter or PagedListAdapter to calculate the minimum number of changes between and old list and a new
 * list that's been passed to `submitList`.
 */

class FavoriteDiffCallBack : DiffUtil.ItemCallback<FavoriteModel>() {
    override fun areItemsTheSame(oldItem: FavoriteModel, newItem: FavoriteModel): Boolean {
        return oldItem.id == newItem.id
    }

    @SuppressLint("DiffUtilEquals")
    override fun areContentsTheSame(oldItem: FavoriteModel, newItem: FavoriteModel): Boolean {
        return oldItem == newItem
    }

}