package dev.danny.tallerdaarlizorenero.Components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.PersonPin
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ParamScreen(navController: NavHostController, name: String?) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "PARAMETROS",
                        color = Color.Black,
                        fontSize = 30.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowLeft,
                            contentDescription = "Go Back"
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {
            // Contenido principal desplazable
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Icono principal
                    Icon(
                        imageVector = Icons.Default.PersonPin,
                        contentDescription = "Go to back",
                        modifier = Modifier.size(100.dp)
                    )


                Spacer(modifier = Modifier.height(16.dp))

                // Iconos asociados
                Row(
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Edit,
                        contentDescription = "Icono Editar",
                        tint = Color.Green,
                        modifier = Modifier.size(48.dp)
                    )
                    Text(
                        text = name ?: "Nombre no disponible",
                        fontSize = 30.sp,
                        color = Color.Black
                    )
                    Icon(
                        imageVector = Icons.Default.Call,
                        contentDescription = "Icono Llamar",
                        tint = Color.Black,
                        modifier = Modifier.size(48.dp)
                    )
                }
            }

            // Botón flotante en la parte inferior centrado
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.BottomCenter
            ) {
                FloatingActionButton(
                    onClick = { navController.navigate("home") },
                    containerColor = Color.LightGray, // Fondo blanco del botón
                    modifier = Modifier
                        .padding(16.dp)
                        .width(200.dp) // Ancho personalizado
                ) {
                    Text(
                        text = "Regresar",
                        color = Color.Black, // Texto en color magenta
                        fontSize = 18.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}