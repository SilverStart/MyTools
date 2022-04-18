package silverstar.gold.mytools.visual.transformation.sample

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import silverstar.gold.mytools.visual.transformation.PhoneNumberVisualTransformation

@Composable
fun SampleTextField(modifier: Modifier = Modifier) {
    TextField(
        modifier = modifier.fillMaxWidth(),
        value = "text",
        onValueChange = {},
        singleLine = true,
        leadingIcon = null,
        visualTransformation = PhoneNumberVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
    )
}