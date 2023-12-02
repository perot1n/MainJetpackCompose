package com.example.labochka


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Callingscreen()
        }
    }
}

@Composable
fun Callingscreen() {

    Image(
        painter = painterResource(id = R.drawable.budanov),
        contentDescription = "Background Photo",
        modifier = Modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(15)),
        contentScale = ContentScale.Crop
    )
    Box(
        modifier = Modifier.fillMaxSize(),
    )
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(8.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    )
        {
        Image(
        painter = painterResource(id = R.drawable.backbutton),
        contentDescription = "Back Button",
        modifier = Modifier
            .size(120.dp)
            .padding(32.dp)
    )}

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(64.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Calling ...",
                color = Color(0xFFD3D1D1),
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Text(
                text = "Kyrylo  Budanov",
                color = Color.White,
                fontSize = 24.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(bottom = 24.dp)
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(id = android.R.drawable.stat_notify_call_mute),
                    contentDescription = "Button Call Mute",
                    modifier = Modifier.size(71.dp)
                )

                Spacer(modifier = Modifier.width(16.dp))

                Image(
                    painter = painterResource(id = R.drawable.endcallbutton),
                    contentDescription = "End Call Button",
                    modifier = Modifier.size(75.dp)
                )

                Spacer(modifier = Modifier.width(16.dp))

                Image(
                    painter = painterResource(id = android.R.drawable.stat_sys_speakerphone),
                    contentDescription = "Loudspeaker Button",
                    modifier = Modifier.size(72.dp)
                )
            }
        }

    }


@Preview
@Composable
fun CallingscreenPreview() {
    Callingscreen()
}




