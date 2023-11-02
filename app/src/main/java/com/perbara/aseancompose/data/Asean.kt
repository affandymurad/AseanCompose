package com.perbara.aseancompose.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.perbara.aseancompose.R

data class Asean (
    @StringRes val name: Int,
    @StringRes val officialName: Int,
    val description: String,
    @StringRes val currency: Int,
    val capital: String,
    @StringRes val telephone: Int,
    val joinDate: String,
    val status: String,
    @DrawableRes val imageAsset: Int,
    @DrawableRes val imageFlag: Int
)

val aseans = listOf(
    Asean(
        R.string.id,
        R.string.id_on,
        "Republik Indonesia, adalah negara kepulauan di Asia Tenggara yang dilintasi garis khatulistiwa dan berada di antara daratan benua Asia dan Oseania sehingga dikenal sebagai negara lintas benua, serta antara Samudra Pasifik dan Samudra Hindia.",
        R.string.id_c,
        "Jakarta",
        R.string.id_tel,
        "08/08/1967",
        "Pendiri",
        R.drawable.id_map,
        R.drawable.id
    ),
    Asean(
        R.string.my,
        R.string.my_on,
        "Malaysia adalah sebuah negara federal yang terdiri dari tiga belas negeri (negara bagian) dan tiga wilayah federal di Asia Tenggara dengan luas 330.803 km persegi. Ibu kotanya adalah Kuala Lumpur, sedangkan Putrajaya menjadi pusat pemerintahan federal.",
        R.string.my_c,
        "Kuala Lumpur",
        R.string.my_tel,
        "08/08/1967",
        "Pendiri",
        R.drawable.my_map,
        R.drawable.my
    ),
    Asean(
        R.string.sg,
        R.string.sg_on,
        "Singapura adalah sebuah negara pulau dan negara kota di lepas ujung selatan Semenanjung Malaya, 137 kilometer (85 mi) di utara khatulistiwa di Asia Tenggara. Negara ini terpisah dari Malaysia oleh Selat Johor di utara, dan dari Kepulauan Riau, Indonesia oleh Selat Singapura di selatan.",
        R.string.sg_c,
        "Singapura",
        R.string.sg_tel,
        "08/08/1967",
        "Pendiri",
        R.drawable.sg_map,
        R.drawable.sg
    ),
    Asean(
        R.string.th,
        R.string.th_on,
        "Thailand adalah sebuah negara di Asia Tenggara yang berbatasan dengan Laos dan Kamboja di timur, Malaysia dan Teluk Siam di selatan, dan Myanmar dan Laut Andaman di barat. Kerajaan Thai dahulu dikenal sebagai Siam sampai tanggal 11 Mei 1949.",
        R.string.th_c,
        "Bangkok",
        R.string.th_tel,
        "08/08/1967",
        "Pendiri",
        R.drawable.th_map,
        R.drawable.th
    ),
    Asean(
        R.string.ph,
        R.string.ph_on,
        "Filipina adalah sebuah negara kepulauan dan negara kesatuan yang bersistem presidensial dengan berbentuk republik konstitusional di Asia Tenggara, sebelah utara Indonesia, dan timur laut Sabah. Filipina merupakan sebuah negara kepulauan yang terletak di Lingkar Pasifik Barat, negara ini terdiri dari 7.641 pulau.",
        R.string.ph_c,
        "Manila",
        R.string.ph_tel,
        "08/08/1967",
        "Pendiri",
        R.drawable.ph_map,
        R.drawable.ph
    ),
    Asean(
        R.string.bn,
        R.string.bn_on,
        "Brunei adalah negara berdaulat di Asia Tenggara yang terletak di pantai utara pulau Kalimantan. Negara ini memiliki wilayah seluas 5.765 km² yang menempati pulau Kalimantan dengan garis pantai seluruhnya menyentuh Laut Tiongkok Selatan. Wilayahnya dipisahkan ke dalam negara bagian di Sarawak, Malaysia.",
        R.string.bn_c,
        "Bandar Seri Begawan",
        R.string.bn_tel,
        "07/01/1984",
        "Anggota",
        R.drawable.bn_map,
        R.drawable.bn
    ),
    Asean(
        R.string.vn,
        R.string.vn_on,
        "Vietnam adalah negara di Asia Tenggara Daratan. Vietnam berbatasan dengan Tiongkok di utara, Laos di barat laut, Kamboja di barat daya, dan dengan Laut Tiongkok Selatan di timur. Laut Tiongkok Selatan di Vietnam disebut Laut Timur.",
        R.string.vn_c,
        "Hanoi",
        R.string.vn_tel,
        "28/07/1995",
        "Anggota",
        R.drawable.vn_map,
        R.drawable.vn
    ),
    Asean(
        R.string.la,
        R.string.la_on,
        "Laos adalah sebuah negara yang terkurung daratan di Asia Tenggara, yang berbatasan dengan Myanmar dan Republik Rakyat Tiongkok di sebelah barat laut, Vietnam di timur, Kamboja di selatan, dan Thailand di sebelah barat. Dari abad ke-14 hingga abad ke-18, negara ini disebut Lan Xang atau \"Negeri Seribu Gajah\".",
        R.string.la_c,
        "Vientiane",
        R.string.la_tel,
        "23/07/1997",
        "Anggota",
        R.drawable.la_map,
        R.drawable.la
    ),
    Asean(
        R.string.mm,
        R.string.mm_on,
        "Myanmar juga dikenal sebagai Burma (nama resmi hingga tahun 1989), adalah sebuah negara berdaulat di Asia Tenggara. Myanmar berbatasan dengan India dan Bangladesh di sebelah barat, Thailand dan Laos di sebelah timur dan Tiongkok di sebelah utara dan timur laut. Negara seluas 676.578 km² ini telah diperintah oleh pemerintahan militer sejak kudeta tahun 1988. Negara ini adalah negara berkembang dan memiliki populasi lebih dari 51 juta jiwa (sensus 2014).",
        R.string.mm_c,
        "Naypyidaw",
        R.string.mm_tel,
        "23/07/1997",
        "Anggota",
        R.drawable.mm_map,
        R.drawable.mm
    ),
    Asean(
        R.string.kh,
        R.string.kh_on,
        "Kamboja adalah sebuah negara berbentuk monarki konstitusional di Asia Tenggara. Negara ini merupakan penerus Kekaisaran Khmer yang pernah menguasai seluruh Semenanjung Indochina antara abad ke-11 dan 14. Kamboja berbatasan dengan Thailand di sebelah barat, Laos di utara, Vietnam di timur, dan Teluk Thailand di selatan. Sungai Mekong dan Danau Tonle Sap melintasi negara ini.",
        R.string.kh_c,
        "Phnom Penh",
        R.string.kh_tel,
        "30/04/1999",
        "Anggota",
        R.drawable.kh_map,
        R.drawable.kh
    ),
    Asean(
        R.string.tl,
        R.string.tl_on,
        "Timor Leste yang sebelum merdeka dari Indonesia bernama Timor Timur, adalah sebuah negara pulau di Asia Tenggara.[16] Negara ini berada di sebelah utara Australia dan bagian timur pulau Timor. Selain itu wilayah negara ini juga meliputi pulau Kambing atau Atauro, Jaco, dan eksklave Oe-Cusse Ambeno di Timor Barat.",
        R.string.tl_c,
        "Dili",
        R.string.tl_tel,
        "11/11/2022",
        "Anggota",
        R.drawable.tl_map,
        R.drawable.tl
    )
)