package br.senai.sp.jandira.lionschool.screens.components

import android.media.Image
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun CardCurso(
    texto1 : String ="",
    texto2 : String ="",
    texto3 : String ="",
    texto4 : String ="",
    imagem : Painter = painterResource(R.drawable.dsimg)
) {
    Card (
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(190.dp),
        border = BorderStroke(
            width = 1.dp,
            color = colorResource(R.color.amarelo)
        )
    ){
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(190.dp)
                .background(brush = Brush.linearGradient(
                    listOf(
                        colorResource(R.color.azul_logo),
                        colorResource(R.color.azul_claro)
                    )
                )
                )
                .padding(10.dp)
        ){
            Column {
                Row {
                    Image(
                        painter = imagem,
                        contentDescription = "",
                        modifier = Modifier
                            .width(100.dp)
                            .height(100.dp)

                    )
                    Row(
                        modifier = Modifier
                            .padding(10.dp, top = 10.dp)
                    ) {
                        Text(
                            text = texto1,
                            color = colorResource(R.color.amarelo),
                            fontSize = 80.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }

                }
                Column (
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = texto2,
                        color = Color.White,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Row(
                        modifier = Modifier
                            .padding(top = 2.dp)
                    ) {
                        Text(
                            text = texto3,
                            color = Color.White,
                            fontSize = 10.sp
                        )
                    }
                    Row(
                        modifier = Modifier
                            .padding(top = 15.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(R.drawable.duracao),
                            contentDescription = "",
                            modifier = Modifier
                                .width(10.dp)
                                .height(10.dp)
                        )
                        Row (
                            modifier = Modifier
                                .padding(start = 5.dp)
                        ){
                            Text(
                                text = texto4,
                                color = Color.White,
                                fontSize = 10.sp
                            )
                        }

                    }

                }
            }
        }
    }

}

@Composable
@Preview
private fun CardPreview(){
    CardCurso()
}
