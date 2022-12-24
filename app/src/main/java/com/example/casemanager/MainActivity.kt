package com.example.casemanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.casemanager.ui.theme.LightBlue


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(modifier = Modifier
                .fillMaxSize()
                .background(color = LightBlue)){
                MainButtons()
            }

        }
    }

}



@Preview(showBackground = true)
@Composable
fun MainButtons(){


    Image(
        modifier = Modifier
            .width(500.dp)
            .height(420.dp)
            .offset(x = 0.dp, y = 370.dp),
        painter = painterResource(id = R.drawable.menu),
        contentDescription = stringResource(id = R.string.content_menu),
        contentScale = ContentScale.Crop,
    )


    Row(modifier = Modifier
        .width(500.dp)
        .height(60.dp)
        .offset(x = 0.dp, y = 585.dp)
        .padding(6.dp),
    )
    {



        Button(modifier = Modifier.clickable {  },
            onClick = { /*TODO*/ }) {
            Text(text = "Настройки")
        }

        Spacer(modifier = Modifier.weight(1f))

        Button(modifier = Modifier.clickable {  },
            onClick = { /*TODO*/ }) {
            Text(text = "Старт")
        }

        Spacer(modifier = Modifier.weight(1f))

        Button(modifier = Modifier.clickable {  },
            onClick = { /*TODO*/ }) {
            Text(text = "Завершить")
        }

    }

}












