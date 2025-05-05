package com.example.tarjetadepresentacion

import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetadepresentacion.ui.theme.TarjetaDePresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaDePresentacionTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFB4CFEC)
                ) {
                    TarjetaPresentacion()
                }
            }
        }
    }
}
@Composable
fun TarjetaPresentacion() {
    val verdeOscuro = Color(0xFF006400)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        // Encabezado centrado
        Column(
            modifier = Modifier
                .align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
                    .background(verdeOscuro),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.android_logo),
                    contentDescription = null,
                    modifier = Modifier.size(80.dp)
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = stringResource(R.string.nombre_texto),
                fontSize = 32.sp,
                fontWeight = FontWeight.Light
            )
            Text(
                text = stringResource(R.string.desarrollador_android_texto),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = verdeOscuro
            )
        }

// Datos personales en la parte inferior con íconos de Material
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 24.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(4.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Phone,
                    contentDescription = "Número de Teléfono",
                    tint = Color(0xFF006400)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "+595 982853640", fontSize = 14.sp)
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(4.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Share,
                    contentDescription = "Red Social Instagram Usuario",
                    tint = Color(0xFF006400)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "@danny_candia", fontSize = 14.sp)
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(4.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Correo Electrónico",
                    tint = Color(0xFF006400)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "danny@pninformatica.com.py", fontSize = 14.sp)
            }
        }

    }
}
