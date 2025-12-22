package com.example.finpro.products

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp


@Composable
fun OrderBottomBar() {
    var qty by remember { mutableIntStateOf(1) }

    Surface (
        shadowElevation = 8.dp
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(
                    onClick = { if (qty > 1) qty-- }
                ) {
                    Text("-", fontSize = 20.sp)
                }

                Text(
                    text = qty.toString(),
                    modifier = Modifier.padding(horizontal = 8.dp),
                    fontSize = 18.sp
                )

                IconButton(
                    onClick = { qty++ }
                ) {
                    Text("+", fontSize = 20.sp)
                }
            }

            Button (
                onClick = {  },
                modifier = Modifier.height(48.dp)
            ) {
                Text("Order")
            }
        }
    }
}
