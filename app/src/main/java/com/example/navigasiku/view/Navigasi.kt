package com.example.navigasiku.view

// Asumsi: Definisi Rute Navigasi
enum class Navigasi {
    FormulirKu, // 3 Usages di file ini
    Detail      // 2 Usages di file ini
    // ... rute lain jika ada
}

// Asumsi: Fungsi helper untuk padding
// IsiRuang biasanya bertipe PaddingValues
val IsiRuang: Any // Ganti dengan tipe data yang benar, kemungkinan PaddingValues

// 1 Usage
@Composable
fun DataApp() {
    val navController: NavHostController = rememberNavController()

    Scaffold(
        content = {
                IsiRuang -> // Mendapatkan PaddingValues dari Scaffold
            NavHost(
                navController = navController,
                startDestination = Navigasi.FormulirKu.name, // Rute awal adalah FormulirKu
                modifier = Modifier.padding(paddingValues = IsiRuang)
            ) {
                // Composable 1: FormulirKu (Rute Utama)
                composable(route = Navigasi.FormulirKu.name) {
                    FormulirKu(
                        // (// pilihanJK = JenisK.map { id -> konteks.resources.getString(id) },)
                        OnSubmitBtnClick = {
                            // Navigasi ke Detail saat tombol submit diklik
                            navController.navigate(route = Navigasi.Detail.name)
                        }
                    )
                }

                // Composable 2: Detail (Rute Detail)
                composable(route = Navigasi.Detail.name) {
                    TampilData(
                        onBackBtnClick = {
                            // Panggil fungsi kustom untuk kembali ke FormulirKu
                            cancelAndBackToFormulir(navController)
                        }
                    )
                }
            }
        }
    )
}

// 1 Usage
/**
 * Pops the back stack until it reaches the FormulirKu route.
 * inclusive = false ensures FormulirKu remains on the back stack as the current screen.
 */
private fun cancelAndBackToFormulir(navController: NavHostController) {
    navController.popBackStack(route = Navigasi.FormulirKu.name, inclusive = false)
}

// Asumsi: Definisi Composable
@Composable
fun FormulirKu(OnSubmitBtnClick: () -> Unit) { /* ... implementasi FormulirKu ... */ }

@Composable
fun TampilData(onBackBtnClick: () -> Unit) { /* ... implementasi TampilData ... */ }

