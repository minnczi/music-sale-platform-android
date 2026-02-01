package com.rebuy.app.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.rebuy.app.data.model.MockProducts
import com.rebuy.app.data.model.Product
import com.rebuy.app.ui.components.ProductCard

@Composable
fun HomeScreen(
    onProductClick: (Product) -> Unit = {},
    modifier: Modifier = Modifier
) {
    val products = remember { MockProducts.products }

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        contentPadding = PaddingValues(16.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(
            items = products,
            key = { it.id }
        ) { product ->
            ProductCard(
                product = product,
                onProductClick = onProductClick,
                onLikeClick = { /* Handle like */ }
            )
        }
    }
}
