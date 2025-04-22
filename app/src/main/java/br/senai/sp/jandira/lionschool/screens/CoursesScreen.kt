package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R
import br.senai.sp.jandira.lionschool.screens.components.CardCurso
import br.senai.sp.jandira.lionschool.screens.components.Logo


@Composable
fun CoursesScreen (modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
            ) {
                Logo(
                    modifier = Modifier
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(20.dp),
                color = colorResource(R.color.amarelo)
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(35.dp)
                    .padding(20.dp)
                    .background(color = colorResource(R.color.cinza_claro)),
                label = { Text(text = stringResource(R.string.find_course)) },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "",
                        tint = Color.Gray
                    )
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Next
                ),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedTextColor = colorResource(R.color.amarelo),
                    cursorColor = colorResource(R.color.amarelo),
                    unfocusedBorderColor = colorResource(R.color.amarelo)
                ),
                textStyle = TextStyle(
                    fontSize = 20.sp,
                    color = Color.Gray
                )
            )
            Column(
                modifier = Modifier
                    .padding(20.dp)
            ) {

                Row (){
                    Image(
                        painter = painterResource(R.drawable.list),
                        contentDescription = "",
                        modifier = Modifier
                            .width(36.dp)
                            .height(36.dp)
                    )
                    Text(
                        text = stringResource(R.string.courses),
                        color = colorResource(R.color.azul_logo),
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Row(
                    modifier = Modifier
                        .padding(top = 10.dp)
                ) {
                    CardCurso(
                        texto1 = "DS",
                        texto2 = "Desenvolvimento de Sistemas",
                        texto3 = "Learn to develop web and mobile applications.",
                        texto4 = "3 semestres",
                        imagem = painterResource(R.drawable.dsimg)
                    )
                }
                Row(
                    modifier = Modifier
                        .padding(top = 10.dp)
                ) {
                    CardCurso(
                        texto1 = "RDS",
                        texto2 = "Redes de Computadores",
                        texto3 = "Learn to design communication networks.",
                        texto4 = "3 semestres",
                        imagem = painterResource(R.drawable.rds)
                    )
                }
                Row(
                    modifier = Modifier
                        .padding(top = 10.dp)
                ) {
                    CardCurso(
                        texto1 = "ELE",
                        texto2 = "Eletroeletrônica",
                        texto3 = "LLearn to design communication networks.",
                        texto4 = "3 semestres",
                        imagem = painterResource(R.drawable.ele)
                    )
                }
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun CoursesSCreenPreview(){
        CoursesScreen(modifier = Modifier)
}