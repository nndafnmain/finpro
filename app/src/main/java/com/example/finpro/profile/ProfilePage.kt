package com.example.finpro.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CreditCard
import androidx.compose.material.icons.filled.Explore
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.finpro.R

@Preview
@Composable
fun ProfilePage(){
    Column(
            modifier = Modifier.fillMaxSize().background(Color(0xffEBE4D6)).padding(top = 25.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Text("Profile", fontSize = 24.sp, fontWeight = FontWeight.Bold)

            Spacer(Modifier.height(20.dp))

            Image(
                painterResource(id = R.drawable.moix),
                contentDescription = "MOI CAICEDO",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(100.dp).clip(CircleShape)
            )
            Spacer(Modifier.height(8.dp))
            Text("Moises Caicedo", fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Spacer(Modifier.height(8.dp))
            Text("moises@gmail.com")

            Spacer(Modifier.height(14.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xffC75C39)
        )) {
               Text("Edit profile")
        }

        Spacer(Modifier.height(12.dp))

            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xffF7F0E8),
                ),
                modifier = Modifier
                    .size(width = 350.dp, height = 270.dp)
            ) {
                Row(
                    modifier = Modifier.padding(20.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)

                ) {
                    Icon(
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = "Riwayat Belanja"
                    )
                    Text("Riwayat Pesanan", fontSize = 20.sp)
                }

                Row(
                    modifier = Modifier.padding(20.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)

                ) {
                    Icon(
                        imageVector = Icons.Default.CreditCard,
                        contentDescription = "Riwayat Belanja"
                    )
                    Text("Bonus dan Hadiah", fontSize = 20.sp)
                }

                Row(
                    modifier = Modifier.padding(20.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)

                ) {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Pusat bantuan"
                    )
                    Text("Pusat Bantuan", fontSize = 20.sp)
                }

                Row(
                    modifier = Modifier.padding(20.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)

                ) {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "Riwayat Belanja"
                    )
                    Text("Kebijakan Privasi", fontSize = 20.sp)
                }
            }

        Spacer(Modifier.height(25.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xffC75C39)
            )
            ) {
            Text("Keluar Akun")
        }
        }
    }
