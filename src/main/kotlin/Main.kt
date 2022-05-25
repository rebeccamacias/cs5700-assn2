// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
@Composable
@Preview
fun App() {
    val viewHelper = remember { TrackerViewHelper() }
//    val viewHelpers = remember { mutableStateListOf<TrackerViewHelper>() }
    MaterialTheme {
        Column {
            Row {
                Text(viewHelper.result)
            }
            Row {
                TextField(viewHelper.userInput, { viewHelper.userInput = it })
                Button(onClick = {
                    viewHelper.trackShipment(viewHelper.userInput)
                    viewHelper.userInput = ""
                }) {
                    Text("Track")
                }
            }

        }

    }
}

fun trackShipment(shipment: Shipment, stopTracking: () -> Unit) {
    MaterialTheme{
        Surface (){
            Row {
                
            }
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
