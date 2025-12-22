package com.example.finpro.products

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.finpro.R

@Composable
fun ProductDetailContent(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .background(Color(0xffEBE4D6))
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Image(
            painter = painterResource(id = R.drawable.kopi),
            contentDescription = "Product detail",
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(Modifier.height(20.dp))

        Text(
            "Kopi Robusta Toraja",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xffC75C39)
        )

        Spacer(Modifier.height(10.dp))
        Text("Tipe: Arabica", fontSize = 16.sp)

        Spacer(Modifier.height(10.dp))
        Text("Rp 99.000", fontSize = 22.sp, fontWeight = FontWeight.Bold)

        Spacer(Modifier.height(20.dp))
        HorizontalDivider(thickness = 2.dp)

        Spacer(Modifier.height(16.dp))
        Text("Description", fontWeight = FontWeight.Bold, fontSize = 24.sp)

        Spacer(Modifier.height(8.dp))
        Text(
            "A coffee bean is the seed of the Coffea plant...",
            color = Color.Black
        )

        Spacer(Modifier.height(100.dp)) // breathing space
    }
}
