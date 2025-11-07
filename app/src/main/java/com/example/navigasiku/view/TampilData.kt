@OptIn(markerClass = ExperimentalMaterial3Api::class)
@Composable
fun InputNama(
    nama: String,
    onNamaChange: (String) -> Unit
) {
    OutlinedTextField(
        value = nama,
        onValueChange = onNamaChange,
        label = { Text("Nama") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        singleLine = true
    )
}
