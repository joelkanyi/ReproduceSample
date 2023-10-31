package com.joelkanyi.reproducebugsample

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun Main() {
    Column {
        Image(
            painter = painterResource("il_completed.xml"),
            contentDescription = "Completed",
            modifier = Modifier.size(200.dp),
        )
    }
}
