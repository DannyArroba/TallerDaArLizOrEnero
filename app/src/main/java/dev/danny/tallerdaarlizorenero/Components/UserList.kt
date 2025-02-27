package dev.danny.tallerdaarlizorenero.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Bathtub
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import dev.danny.tallerdaarlizorenero.Reusable.ItemContact
import dev.danny.tallerdaarlizorenero.Reusable.ItemContact2

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserScreen(navController: NavHostController) {
    Scaffold(

        topBar = {
            TopAppBar(

                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Go to back"
                        )
                    }
                },
                title = { Text("Lista Usuarios", color = Color.Black) },

            )
        }

    ) { paddingValues ->

        Column(
            modifier = Modifier.padding(paddingValues)
                .verticalScroll(rememberScrollState())

        ) {
            ItemContact( " Luis Perez", Icons.Default.Edit,Icons.Default.Call, navController)
            HorizontalDivider()
            ItemContact( "Mario Cajas", Icons.Default.Edit,Icons.Default.Call, navController)
            HorizontalDivider()
            ItemContact( "Fernando Arteaga", Icons.Default.Edit,Icons.Default.Call,navController)
            HorizontalDivider()
            ItemContact2( " Ribaldo Natip", Icons.Default.Bathtub,Icons.Default.Call, navController)
            HorizontalDivider()
            ItemContact2( "Jostin Torres", Icons.Default.Bathtub,Icons.Default.Call, navController)
            HorizontalDivider()
            ItemContact2( "Domenica Torres", Icons.Default.Bathtub,Icons.Default.Call,navController)


        }
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.BottomCenter
        ) {
            FloatingActionButton(
                onClick = { navController.popBackStack() },
                containerColor = Color.White, // Fondo blanco del botón
                modifier = Modifier.padding(16.dp).width(200.dp)// Espaciado desde el borde inferior
            ) {
                Text(
                    text = "Regresar",
                    color = Color.Magenta, // Texto en color magenta
                    fontSize = 18.sp,

                    textAlign = TextAlign.Center
                )
            }
        }


    }
}