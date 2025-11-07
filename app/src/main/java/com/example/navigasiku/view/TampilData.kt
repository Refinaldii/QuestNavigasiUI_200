@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampiData(
    onBackBtnClick: () -> Unit
) {

    val items = listOf(
        Pair(stringResource(id = R.string.nama_lengkap), "Contoh Nama"),
        Pair(stringResource(id = R.string.jenis_kelamin), "Laki-laki"),
        Pair(stringResource(id = R.string.alamat), "Yogyakarta")
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(id = R.string.title),
                        color = Color.White
                    )
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(id = R.color.teal_700)
                )
            )
        }
    ) { paddingValues ->

        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.space_medium))
        ) {

            items.forEach { item ->
                Column {
                    Text(
                        text = item.first.uppercase(),
                        fontSize = 16.sp
                    )

                    Text(
                        text = item.second,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Cursive,
                        fontSize = 22.sp
                    )

                    HorizontalDivider(
                        thickness = 1.dp,
                        color = Color.Cyan
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = onBackBtnClick
            ) {
                Text(text = stringResource(id = R.string.back))
            }
        }
    }
}
