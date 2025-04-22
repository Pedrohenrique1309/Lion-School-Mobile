package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun TelaInicial(modifier: Modifier = Modifier){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color.White
            )
    ){
        Column (
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ){
            Row(
              modifier = Modifier
                  .fillMaxWidth()
                  .padding(
                      start = 25.dp
                  )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "",
                    modifier = Modifier
                        .width(150.dp)
                        .height(150.dp)
                )
                Text(
                    text = stringResource(R.string.lion_school),
                    color = colorResource(R.color.azul_logo),
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .width(150.dp)
                        .padding(top = 20.dp)
                )
            }
            Column (
                modifier = Modifier
                    .padding(23.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(R.string.your_favorite_curse),
                    color = colorResource(R.color.azul_logo),
                    fontWeight = FontWeight.Bold,
                    fontSize = 27.sp,
                    modifier = Modifier
                        .padding(bottom = 10.dp)
                )
                Card(
                    modifier = Modifier
                        .width(70.dp)
                        .height(7.dp),
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(
                        colorResource(R.color.amarelo)
                    )
                ){}
                Text(
                    text = stringResource(R.string.introducao),
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(top = 30.dp),
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center
                )

            }
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(
                        start = 30.dp,
                        end = 30.dp
                    ),
                shape = RoundedCornerShape(15.dp),
                colors = ButtonDefaults.buttonColors(
                    colorResource(R.color.amarelo)
                ),
                border = BorderStroke(
                    width = 2.dp,
                    color = colorResource(R.color.azul_logo)
                )
            ) {
                Text(
                    text = stringResource(R.string.get_started),
                    color = colorResource(R.color.azul_logo),
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 55.dp, end = 55.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Image(
                    painter = painterResource(R.drawable.youtube),
                    contentDescription = "",
                    modifier = Modifier
                        .width(30.dp)
                        .height(30.dp)
                )
                Image(
                    painter = painterResource(R.drawable.twitter),
                    contentDescription = "",
                    modifier = Modifier
                        .width(30.dp)
                        .height(30.dp)
                )
                Image(
                    painter = painterResource(R.drawable.instagram),
                    contentDescription = "",
                    modifier = Modifier
                        .width(30.dp)
                        .height(30.dp)
                )
                Image(
                    painter = painterResource(R.drawable.facebook),
                    contentDescription = "",
                    modifier = Modifier
                        .width(30.dp)
                        .height(30.dp)
                )
            }
        }
    }

}

@Preview(showSystemUi =  true)
@Composable
private fun TelaInicialPreview(){
    TelaInicial(modifier = Modifier)
}

