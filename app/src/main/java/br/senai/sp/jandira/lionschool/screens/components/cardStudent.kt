package br.senai.sp.jandira.lionschool.screens.components

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R
import java.util.Date

@Composable
fun CardStudent (
    nome: String = "",
    documento: String = "",
    anoTermino: String = "",
    foto: Painter = painterResource(R.drawable.ellipse),
    modifier: Modifier = Modifier
){

    Card (
        modifier = Modifier
            .fillMaxWidth()
            .height(65.dp)
            .padding(end = 20.dp),
        colors = CardDefaults.cardColors(colorResource(R.color.azul_students)),
        shape = RoundedCornerShape(10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
        ) {
            Card(
                colors = CardDefaults.cardColors(colorResource(R.color.amarelo)),
                shape = RoundedCornerShape(
                    topEnd = 0.dp,
                    bottomEnd = 0.dp
                ),
                modifier = Modifier
                    .fillMaxHeight()
                    .width(10.dp)
            ) {}
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(start = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = foto,
                    contentDescription = "",
                    modifier = Modifier
                        .height(40.dp)
                        .width(40.dp)
                )
                Column {
                    Text(
                        text = nome,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier
                            .padding(start = 5.dp)
                    )
                    Row {
                        Image(
                            painter = painterResource(R.drawable.document),
                            contentDescription = "",
                            modifier = Modifier
                                .width(20.dp)
                                .height(17.dp)
                                .padding(start = 5.dp, top = 5.dp)
                        )
                        Text(
                            text = documento,
                            fontSize = 10.sp,
                            color = Color.White,
                            modifier = Modifier
                                .padding(start = 5.dp, top = 5.dp)
                        )
                    }

                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .padding(end = 10.dp, bottom = 10.dp),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.Bottom
                ) {
                    Image(
                        painter = painterResource(R.drawable.vector),
                        contentDescription = "",
                        modifier = Modifier
                            .width(12.dp)
                            .height(12.dp)
                            .padding(bottom = 2.dp)
                    )
                    Text(
                        text = anoTermino,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(R.color.amarelo),
                        modifier = Modifier
                            .padding(start = 5.dp)
                    )
                }

            }
        }
    }

}

@Composable
@Preview
private fun CardPreview(){
    CardStudent()
}