package com.example.finpro.products

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.finpro.R

@Preview
@Composable
fun ProductDetail(){
    Column(
        modifier = Modifier
            .background(Color(0xffEBE4D6))
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.kopi),
            contentDescription = "Product detail",
            modifier = Modifier.fillMaxWidth().padding(top = 20.dp)
        )
        Spacer(Modifier.height(20.dp))
        Text("Kopi Robusta Toraja", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color(0xffC75C39))
        Spacer(Modifier.height(10.dp))
        Text("Tipe: Arabica", fontSize = 16.sp)
        Spacer(Modifier.height(10.dp))
        Text("Rp 99.000", fontSize = 22.sp, fontWeight = FontWeight.Bold)

        Spacer(Modifier.height(20.dp))

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
                    onClick = {  }
                ) {
                    Text("-", fontSize = 20.sp)
                }

                Text(
                    text = "1",
                    modifier = Modifier.padding(horizontal = 8.dp),
                    fontSize = 18.sp
                )

                IconButton(
                    onClick = { }
                ) {
                    Text("+", fontSize = 20.sp)
                }
            }

            Button (
                onClick = {  },
                modifier = Modifier
                    .height(48.dp)
                    .width(200.dp),
                colors = ButtonDefaults.buttonColors(Color(0xffC75C39))
            ) {
                Text("Order")
            }
        }

//        Row (
//            modifier = Modifier.fillMaxWidth()
//        ) {
//
//            IconButton(
//                onClick = {}
//            ) {
//                Text("-")
//            }
//
//            Text("1")
//
//            IconButton(
//                onClick = {}
//            ) {
//                Text("+")
//            }
//        }

        Spacer(Modifier.height(20.dp))

        HorizontalDivider(thickness = 2.dp)

        Spacer(Modifier.height(16.dp))
        Text("Description", fontWeight = FontWeight.Bold, fontSize = 24.sp)

        Spacer(Modifier.height(8.dp))
        Text("A coffee bean is the seed of the Coffea plant, commonly referred to as a coffee cherry, which typically contains two seeds. The two main types of coffee beans are Arabica, known for its smooth flavor and lower caffeine content, and Robusta, which has a stronger, more bitter taste and higher caffeine levels.",
            color = Color.Black)
    }
}