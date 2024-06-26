package pl.farmaprom.trainings.contactsapp.ui

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pl.farmaprom.trainings.contactsapp.ui.theme.ContactsAppTheme

@Composable
fun HeaderItem(text: String) {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        text = text,
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true, device = Devices.PIXEL_2_XL)
@Composable
fun HeaderItemPreview() {
    ContactsAppTheme {
        HeaderItem(text = "Preview")
    }
}