@OptIn(markerClass = ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenisK: List<String> = listOf("Laki-laki", "Perempuan"),
    OnSubmitBtnClick: () -> Unit
) {

    Scaffold (modifier=Modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(id = R.string.nama), color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(id = R.color.teal_700)
                )
            )
        }

