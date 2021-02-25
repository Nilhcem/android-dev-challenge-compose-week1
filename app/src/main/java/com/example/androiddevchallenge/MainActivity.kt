/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.typography

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                MyApp()
            }
        }
    }
}

// Start building your app here!
@Composable
fun MyApp() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "list") {
        composable("list") { DogsList(navController) }
        composable("details/{dogId}") { navBackStackEntry ->
            val dog =
                dogs.first { it.id == navBackStackEntry.arguments!!.getString("dogId")!!.toLong() }
            DogsDetails(dog)
        }
    }
}

@Composable
fun DogsList(navController: NavController) {
    Surface(color = MaterialTheme.colors.background) {
        Column(modifier = Modifier.padding(16.dp)) {
            LazyColumn(
                contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                item { DogsListHeader() }
                items(dogs) { dog ->
                    DogsListItem(dog) {
                        //    val context = LocalContext.current
                        navController.navigate("details/${dog.id}")
                    }
                }
            }
        }
    }
}

@Composable
fun DogsListHeader() {
    Text(
        text = "Find your new best friend!",
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        style = typography.h5,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis
    )
}

@Composable
fun DogsListItem(dog: Dog, onDogClick: (Dog) -> Unit) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .clickable { onDogClick(dog) }
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = dog.resId),
            contentDescription = null,
            modifier = Modifier
                .width(96.dp)
                .height(96.dp)
                .clip(shape = RoundedCornerShape(8.dp)),
            contentScale = ContentScale.Crop
        )
        Spacer(Modifier.width(12.dp))
        Column {
            Text(text = dog.name, style = typography.h6)
            Text(text = dog.description, style = typography.body2)
        }
    }
}

@Composable
fun DogsDetails(dog: Dog) {
    Surface(color = MaterialTheme.colors.background) {
        LazyColumn {
            item {
                Column {
                    Image(
                        painter = painterResource(id = dog.resId),
                        contentDescription = null,
                        modifier = Modifier
                            .requiredHeight(296.dp)
                            .fillMaxWidth(),
                        contentScale = ContentScale.Crop
                    )

                    Column(modifier = Modifier.padding(12.dp)) {
                        Text(dog.name, style = typography.h3)
                        Text(dog.description, style = typography.h5)

                        Spacer(Modifier.height(22.dp))

                        Text(dog.gender.label, style = typography.h6)
                        Text(dog.location, style = typography.h6)

                        Spacer(Modifier.height(22.dp))

                        Text(
                            text = """Hi ${dog.name} here,

            I am a cute, but cheeky pup ready for my very own forever home, would you consider adopting me?

            I do like to play with my sibling, so would love a dog at home to keep me company, or some nice walks out with other social dogs too, to help boost my confidence in everyday life.

            My adoption fee includes me, my desexing, microchip and health check and makes sure I'm up to date with vaccinations, worming and flea treatments!
                            """.trimIndent(),
                            style = typography.body1
                        )
                    }
                }
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        DogsList(rememberNavController())
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        DogsList(rememberNavController())
    }
}

@Preview("Light Theme Details", widthDp = 360, heightDp = 640)
@Composable
fun LightPreviewDetails() {
    MyTheme {
        DogsDetails(dogs[0])
    }
}

@Preview("Dark Theme Details", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreviewDetails() {
    MyTheme(darkTheme = true) {
        DogsDetails(dogs[0])
    }
}
