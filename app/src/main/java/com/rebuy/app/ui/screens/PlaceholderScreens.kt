package com.rebuy.app.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.rebuy.app.ui.theme.Gray400

@Composable
fun PlaceholderScreen(
    title: String,
    icon: ImageVector,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Icon(
                imageVector = icon,
                contentDescription = title,
                modifier = Modifier.size(64.dp),
                tint = Gray400
            )
            Text(
                text = title,
                style = MaterialTheme.typography.headlineMedium,
                color = Gray400
            )
            Text(
                text = "Coming Soon",
                style = MaterialTheme.typography.bodyMedium,
                color = Gray400
            )
        }
    }
}

@Composable
fun MapScreen(modifier: Modifier = Modifier) {
    PlaceholderScreen(
        title = "Map",
        icon = Icons.Outlined.Map,
        modifier = modifier
    )
}

@Composable
fun CommunityScreen(modifier: Modifier = Modifier) {
    PlaceholderScreen(
        title = "Community",
        icon = Icons.Outlined.Groups,
        modifier = modifier
    )
}

@Composable
fun ChatScreen(modifier: Modifier = Modifier) {
    PlaceholderScreen(
        title = "Chat",
        icon = Icons.Outlined.Chat,
        modifier = modifier
    )
}

@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    PlaceholderScreen(
        title = "Profile",
        icon = Icons.Outlined.Person,
        modifier = modifier
    )
}
