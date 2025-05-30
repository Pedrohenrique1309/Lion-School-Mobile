package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R
import br.senai.sp.jandira.lionschool.screens.components.CardCurso
import br.senai.sp.jandira.lionschool.screens.components.CardStudent
import br.senai.sp.jandira.lionschool.screens.components.Logo

@Composable
fun StudentsScreen(modifier: Modifier = Modifier){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
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
                Row(
                    horizontalArrangement = Arrangement.End
                ) {
                    Card (
                        modifier = Modifier
                            .width(40.dp)
                            .height(40.dp),
                        colors = CardDefaults.cardColors(colorResource(R.color.amarelo))
                    ) {
                        Text(
                            text = stringResource(R.string.ds),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = colorResource(R.color.azul_logo)
                        )
                    }
                }

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
                label = { Text(text = stringResource(R.string.find_student)) },
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
                    .fillMaxWidth()
                    .padding(start = 20.dp),
                horizontalAlignment = Alignment.Start
            ){

                Row(
                    modifier = Modifier
                        .padding(top = 20.dp),
                ) {
                    Card (
                        modifier = Modifier
                            .width(80.dp)
                            .height(30.dp),
                        shape = RoundedCornerShape(20.dp),
                        colors = CardDefaults.cardColors(colorResource(R.color.azul_logo))
                    ){
                        Row(
                            modifier = Modifier
                                .padding(5.dp)
                                .padding(start = 10.dp),
                            horizontalArrangement = Arrangement.Center
                        ){
                            Text(
                                text = stringResource(R.string.todos),
                                color = Color.White,
                                fontSize = 15.sp
                            )
                        }
                    }
                    Card (
                        modifier = Modifier
                            .width(105.dp)
                            .height(30.dp)
                            .padding(start = 10.dp),
                        shape = RoundedCornerShape(30.dp),
                        colors = CardDefaults.cardColors(colorResource(R.color.amarelo))
                    ){
                        Row(
                            modifier = Modifier
                                .padding(5.dp)
                                .padding(start = 10.dp),
                            horizontalArrangement = Arrangement.Center
                        ){
                            Text(
                                text = stringResource(R.string.cursando),
                                color = colorResource(R.color.azul_logo),
                                fontSize = 15.sp
                            )
                        }
                    }
                    Card (
                        modifier = Modifier
                            .width(105.dp)
                            .height(30.dp)
                            .padding(start = 10.dp),
                        shape = RoundedCornerShape(30.dp),
                        colors = CardDefaults.cardColors(colorResource(R.color.amarelo))
                    ){
                        Row(
                            modifier = Modifier
                                .padding(5.dp)
                                .padding(start = 10.dp),
                            horizontalArrangement = Arrangement.Center
                        ){
                            Text(
                                text = stringResource(R.string.finalizado),
                                color = colorResource(R.color.azul_logo),
                                fontSize = 15.sp
                            )
                        }
                    }
                }
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp),
                    horizontalArrangement = Arrangement.Start
                ) {
                    Image(
                        painter = painterResource(R.drawable.graduation),
                        contentDescription = "",
                        modifier = Modifier
                            .width(40.dp)
                            .height(30.dp)
                    )
                    Text(
                        text = stringResource(R.string.students_list),
                        color = colorResource(R.color.azul_logo),
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(top = 5.dp)
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(top = 20.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ){
                    CardStudent(
                        nome = "Luana Oliveira Dias",
                        documento = "20151001018",
                        anoTermino = "2022",
                        foto = painterResource(R.drawable.ellipse)
                    )
                    CardStudent(
                        nome = "Luana Oliveira Dias",
                        documento = "20151001018",
                        anoTermino = "2022",
                        foto = painterResource(R.drawable.ellipse)
                    )
                    CardStudent(
                        nome = "Luana Oliveira Dias",
                        documento = "20151001018",
                        anoTermino = "2022",
                        foto = painterResource(R.drawable.ellipse)
                    )
                    CardStudent(
                        nome = "Luana Oliveira Dias",
                        documento = "20151001018",
                        anoTermino = "2022",
                        foto = painterResource(R.drawable.ellipse)
                    )
                    CardStudent(
                        nome = "Luana Oliveira Dias",
                        documento = "20151001018",
                        anoTermino = "2022",
                        foto = painterResource(R.drawable.ellipse)
                    )
                    CardStudent(
                        nome = "Luana Oliveira Dias",
                        documento = "20151001018",
                        anoTermino = "2022",
                        foto = painterResource(R.drawable.ellipse)
                    )
                    CardStudent(
                        nome = "Luana Oliveira Dias",
                        documento = "20151001018",
                        anoTermino = "2022",
                        foto = painterResource(R.drawable.ellipse)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun StudentsScreenPrevie(){
    StudentsScreen(modifier = Modifier)
}