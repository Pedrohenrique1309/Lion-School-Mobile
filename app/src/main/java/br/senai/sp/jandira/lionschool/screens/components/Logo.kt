package br.senai.sp.jandira.lionschool.screens.components

import android.health.connect.datatypes.HeightRecord
import android.icu.text.ListFormatter.Width
import android.util.Size
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun Logo (
    modifier: Modifier,
    isFilled:Boolean = false
)  {
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
                .width(50.dp)
                .height(50.dp)
        )
        Text(
            text = stringResource(R.string.lion_school),
            color = colorResource(R.color.azul_logo),
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .width(70.dp)
                .padding(top = 10.dp)
        )
    }
}

@Preview
@Composable
private fun LogoPreview(){
    Logo(modifier = Modifier)
}