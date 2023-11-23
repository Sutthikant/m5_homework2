package com.harbourspace.unsplash

import android.os.Bundle
import android.service.autofill.OnClickAction
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.harbourspace.unsplash.ui.theme.UnsplashTheme

class DetailsActivity : ComponentActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContent {
      UnsplashTheme {

        LazyColumn {
          item {
            Box {
              Image(
                modifier = Modifier
                  .fillMaxWidth()
                  .height(250.dp),
                painter = painterResource(id = R.drawable.img1),
                contentScale = ContentScale.Crop,
                contentDescription = stringResource(id = R.string.description_image_preview)
              )
              Row(modifier = Modifier.padding(10.dp).align(Alignment.BottomStart), verticalAlignment = Alignment.CenterVertically){
                Icon(
                  modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .padding(10.dp),
                  painter = painterResource(id = R.drawable.location_on),
                  contentDescription = null,
                  tint = Color.White

                )
                location(title = "Bangkok")
              }
            }
          }

          item {
            Row(
              modifier = Modifier.padding(16.dp).fillMaxWidth(),
            ) {
              Row(
                modifier = Modifier
                  .weight(1.0f)
                  .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically
              ) {
                Image(
                  modifier = Modifier
                    .width(40.dp)
                    .height(40.dp)
                    .clip(RoundedCornerShape(20.dp)),
                  painter = painterResource(id = R.drawable.x3copy),
                  contentScale = ContentScale.Crop,
                  contentDescription = null
                )
                Name(title = "John Conner")
              }

              Row(
                modifier = Modifier
                  .weight(1.0f)
                  .wrapContentWidth(Alignment.End)
                  .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically
              ) {
                Icon(
                  modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .padding(10.dp),
                  painter = painterResource(id = R.drawable.download),
                  contentDescription = null
                )
                Icon(
                  modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .padding(10.dp),
                  painter = painterResource(id = R.drawable.favorite),
                  contentDescription = null
                )
                Icon(
                  modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .padding(10.dp),
                  painter = painterResource(id = R.drawable.bookmark),
                  contentDescription = null
                )
              }
            }
          }

          item {
            Row(
              modifier = Modifier.padding(16.dp)
            ) {
              Column(
                modifier = Modifier.weight(1.0f)
              ) {
                AddImageInformation(
                  title = stringResource(id = R.string.details_camera_title),
                  subtitle = stringResource(id = R.string.details_camera_default)
                )
              }

              Column(
                modifier = Modifier.weight(1.0f)
              ) {
                AddImageInformation(
                  title = stringResource(id = R.string.details_aperture_title),
                  subtitle = stringResource(id = R.string.details_aperture_default)
                )
              }
            }
          }

          item {
            Row(
              modifier = Modifier.padding(start = 16.dp, end = 16.dp)
            ) {
              Column(
                modifier = Modifier.weight(1.0f)
              ) {
                AddImageInformation(
                  title = stringResource(id = R.string.details_focal_title),
                  subtitle = stringResource(id = R.string.details_focal_default)
                )
              }

              Column(
                modifier = Modifier.weight(1.0f)
              ) {
                AddImageInformation(
                  title = stringResource(id = R.string.details_shutter_title),
                  subtitle = stringResource(id = R.string.details_shutter_default)
                )
              }
            }
          }

          item {
            Row(
              modifier = Modifier.padding(16.dp)
            ) {
              Column(
                modifier = Modifier.weight(1.0f)
              ) {
                AddImageInformation(
                  title = stringResource(id = R.string.details_iso_title),
                  subtitle = stringResource(id = R.string.details_iso_default)
                )
              }

              Column(
                modifier = Modifier.weight(1.0f)
              ) {
                AddImageInformation(
                  title = stringResource(id = R.string.details_dimensions_title),
                  subtitle = stringResource(id = R.string.details_dimensions_default)
                )
              }
            }
          }

          item {
            Divider(
              modifier = Modifier.padding(start = 16.dp, end = 16.dp),
              thickness = 1.dp,
              color = Color.LightGray
            )
          }

          item {
            Row(
              modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
              horizontalArrangement = Arrangement.SpaceEvenly
            ) {

              Column(
                horizontalAlignment = Alignment.CenterHorizontally
              ) {
                AddImageInformation(
                  title = stringResource(id = R.string.details_views_title),
                  subtitle = stringResource(id = R.string.details_views_default)
                )
              }

              Column(
                horizontalAlignment = Alignment.CenterHorizontally
              ) {
                AddImageInformation(
                  title = stringResource(id = R.string.details_downloads_title),
                  subtitle = stringResource(id = R.string.details_downloads_default)
                )
              }

              Column(
                horizontalAlignment = Alignment.CenterHorizontally
              ) {
                AddImageInformation(
                  title = stringResource(id = R.string.details_likes_title),
                  subtitle = stringResource(id = R.string.details_likes_default)
                )
              }
            }
          }

          item {
            Row(
              modifier = Modifier.padding(16.dp)
            ) {
                FilledTonalButton("Bangkok")
                FilledTonalButton("Thailand")
              }
            }
          }
        }
      }
    }
  }



@Composable
fun AddImageInformation(
  title: String,
  subtitle: String
) {

  Text(
    text = title,
    fontSize = 17.sp,
    fontWeight = FontWeight.Bold,
    color = Color.Black
  )

  Text(
    text = subtitle,
    fontSize = 15.sp,
    color = Color.Black
  )
}

@Composable
fun Name(
  title: String,
) {

  Text(
    text = title,
    fontSize = 17.sp,
    fontWeight = FontWeight.Bold,
    color = Color.Black,
    modifier = Modifier.padding(10.dp),
  )
}

@Composable
fun location(
  title: String,
) {

  Text(
    text = title,
    fontSize = 17.sp,
    fontWeight = FontWeight.Bold,
    color = Color.White
  )
}

@Composable
fun FilledTonalButton(
  title: String
) {
  FilledTonalButton(onClick = { },
                    modifier = Modifier.padding(5.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Gray, contentColor = Color.Black)
  ) {
    Text(title)
  }
}