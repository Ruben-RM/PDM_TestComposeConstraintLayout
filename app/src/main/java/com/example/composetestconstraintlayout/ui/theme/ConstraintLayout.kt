package com.example.composetestconstraintlayout.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun MyConstraintLayout()
{
    ConstraintLayout(modifier = Modifier.fillMaxSize())
    {
        val (boxRed, boxBlue, boxYellow, boxMagenta) = createRefs()

        Box(modifier = Modifier.size(125.dp)
            .background(Color.Red)
            .constrainAs(ref = boxRed)
            {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)
            })

        Box(modifier = Modifier.size(150.dp)
            .background(Color.Blue)
            .constrainAs(ref = boxBlue)
            {
                bottom.linkTo(boxRed.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            })

        Box(modifier = Modifier.size(100.dp)
            .background(Color.Yellow)
            .constrainAs(ref = boxYellow)
            {
                top.linkTo(boxBlue.top)
                bottom.linkTo(boxBlue.bottom)
                end.linkTo(boxBlue.start)
            })

        Box(modifier = Modifier.size(125.dp)
            .background(Color.Magenta)
            .constrainAs(ref = boxMagenta)
            {
                top.linkTo(boxBlue.top)
                bottom.linkTo(boxRed.bottom)
                start.linkTo(boxRed.end)
            })
    }
}