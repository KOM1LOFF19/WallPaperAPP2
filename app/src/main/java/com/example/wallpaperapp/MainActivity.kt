package com.example.wallpaperapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wallpaperapp.adapter.WallPaperAdapter
import com.example.wallpaperapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val thumbs = mutableListOf<String>()


        thumbs.add("https://img.freepik.com/premium-photo/beautiful-mountain-range-reflects-tranquil-water-generative-ai_188544-9117.jpg")
        thumbs.add("https://img.freepik.com/premium-photo/king-jungle-close-up-portrait-lion_802668-84.jpg")
        thumbs.add("https://kartinkof.club/uploads/posts/2022-09/1662466521_1-kartinkof-club-p-novie-i-krasivie-kartinki-gelendvagen-1.jpg")
        thumbs.add("https://wallpapers.com/images/hd/roaring-galaxy-lion-wnc10q4f925ppve3.jpg")
        thumbs.add("https://wallpaperaccess.com/full/58188.jpg")
        thumbs.add("https://img.freepik.com/free-photo/fuji-mountain-kawaguchiko-lake-morning-autumn-seasons-fuji-mountain-yamanachi-japan_335224-102.jpg")
        thumbs.add("https://c4.wallpaperflare.com/wallpaper/764/505/66/baby-groot-4k-hd-superheroes-wallpaper-preview.jpg")
        thumbs.add("https://cdn.wallpapersafari.com/78/61/uCEtVf.jpg")
        thumbs.add("https://c4.wallpaperflare.com/wallpaper/980/804/922/soccer-mohamed-salah-liverpool-f-c-wallpaper-preview.jpg")
        thumbs.add("https://w0.peakpx.com/wallpaper/148/442/HD-wallpaper-neymar-personal-celebration-brazilian-footballers-2020-psg-goal-ligue-1-blue-neon-lights-neymar-da-silva-santos-junior-soccer-football-paris-saint-germain-neymar-jr.jpg")
        thumbs.add("https://wallpaperset.com/w/full/c/a/0/263730.jpg")
        thumbs.add("https://images.hdqwalls.com/wallpapers/superman-2020-07.jpg")
        thumbs.add("https://cdn.wallpapersafari.com/12/42/eIxEjf.jpg")
        thumbs.add("https://wallpaperaccess.com/full/2713203.jpg")
        thumbs.add("https://besthqwallpapers.com/Uploads/18-4-2022/198183/kylian-mbappe-4k-goal-blue-neon-lights-psg.jpg")
        thumbs.add("https://www.tubewp.com/wp-content/uploads/2023/03/erling-haaland-wallpapers-5.jpg")
        thumbs.add("https://wallpapers.com/images/hd/beach-rocks-portrait-agsz4jj940o7a5ql.jpg")
        thumbs.add("https://wallpapercave.com/wp/wp9263463.jpg")
        thumbs.add("https://c4.wallpaperflare.com/wallpaper/457/871/663/movie-poster-wonder-woman-gal-gadot-portrait-display-wallpaper-preview.jpg")
        thumbs.add("https://cdn.wallpapersafari.com/90/9/dfNeyb.jpg")
        thumbs.add("https://c4.wallpaperflare.com/wallpaper/570/775/709/lava-wallpaper-preview.jpg")
        thumbs.add("https://e0.pxfuel.com/wallpapers/973/900/desktop-wallpaper-vinicius-junior-vini-jr-brazilian-real-madrid-football-vinicius-jr.jpg")
        thumbs.add("https://images.pexels.com/photos/1097456/pexels-photo-1097456.jpeg")
        thumbs.add("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/9d4a564f-746a-4c09-80f9-fac15b21c406/dfy91yt-976c34d9-98d7-4db0-beda-6d1de266b586.jpg/v1/fill/w_1183,h_676,q_70,strp/batman_wallpaper_by_imagineaiart99_dfy91yt-pre.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzlkNGE1NjRmLTc0NmEtNGMwOS04MGY5LWZhYzE1YjIxYzQwNlwvZGZ5OTF5dC05NzZjMzRkOS05OGQ3LTRkYjAtYmVkYS02ZDFkZTI2NmI1ODYuanBnIiwiaGVpZ2h0IjoiPD0xMDk3Iiwid2lkdGgiOiI8PTE5MjAifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uud2F0ZXJtYXJrIl0sIndtayI6eyJwYXRoIjoiXC93bVwvOWQ0YTU2NGYtNzQ2YS00YzA5LTgwZjktZmFjMTViMjFjNDA2XC9pbWFnaW5lYWlhcnQ5OS00LnBuZyIsIm9wYWNpdHkiOjk1LCJwcm9wb3J0aW9ucyI6MC40NSwiZ3Jhdml0eSI6ImNlbnRlciJ9fQ.ooWxbsNn7qj6IMng3QXmi__8TECqYg-Qf2U0RePZtD8")
        thumbs.add("https://c4.wallpaperflare.com/wallpaper/517/662/553/batman-4k-computer-desktop-backgrounds-wallpaper-thumb.jpg")
        thumbs.add("https://images.hdqwalls.com/wallpapers/superman-2020-07.jpg")
        thumbs.add("https://e0.pxfuel.com/wallpapers/993/942/desktop-wallpaper-kevin-de-bruyne-soccer-kevindebruyne-belgian-manchestercity-kdb-football-sport-debruyne-mancity.jpg")
        thumbs.add("https://sportishka.com/uploads/posts/2022-04/1651266546_1-sportishka-com-p-mersedes-gelendvagen-brabus-mashini-krasiv-1.jpg")
        thumbs.add("https://c4.wallpaperflare.com/wallpaper/364/693/218/portrait-display-vertical-yin-and-yang-artwork-minimalism-hd-wallpaper-preview.jpg")
        thumbs.add("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/9d4a564f-746a-4c09-80f9-fac15b21c406/dfy2fsn-b39580a7-db30-406d-af05-03600a181baf.jpg/v1/fill/w_1920,h_1097,q_75,strp/superman_wallpaper_by_imagineaiart99_dfy2fsn-fullview.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzlkNGE1NjRmLTc0NmEtNGMwOS04MGY5LWZhYzE1YjIxYzQwNlwvZGZ5MmZzbi1iMzk1ODBhNy1kYjMwLTQwNmQtYWYwNS0wMzYwMGExODFiYWYuanBnIiwiaGVpZ2h0IjoiPD0xMDk3Iiwid2lkdGgiOiI8PTE5MjAifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uud2F0ZXJtYXJrIl0sIndtayI6eyJwYXRoIjoiXC93bVwvOWQ0YTU2NGYtNzQ2YS00YzA5LTgwZjktZmFjMTViMjFjNDA2XC9pbWFnaW5lYWlhcnQ5OS00LnBuZyIsIm9wYWNpdHkiOjk1LCJwcm9wb3J0aW9ucyI6MC40NSwiZ3Jhdml0eSI6ImNlbnRlciJ9fQ.n_5W1YnYNR_bGYzatDNAdWOGJ9F67txkVh4ekScTbiU")
        thumbs.add("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/aaa79357-9476-4c1d-b9a8-6e881f2449d3/dfwgq2i-f5d9a401-bd57-4beb-a257-73dc0186eba1.jpg/v1/fill/w_600,h_364,q_75,strp/superman_wallpaper_by_buffy2ville_dfwgq2i-fullview.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcL2FhYTc5MzU3LTk0NzYtNGMxZC1iOWE4LTZlODgxZjI0NDlkM1wvZGZ3Z3EyaS1mNWQ5YTQwMS1iZDU3LTRiZWItYTI1Ny03M2RjMDE4NmViYTEuanBnIiwiaGVpZ2h0IjoiPD0zNjQiLCJ3aWR0aCI6Ijw9NjAwIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmltYWdlLndhdGVybWFyayJdLCJ3bWsiOnsicGF0aCI6Ilwvd21cL2FhYTc5MzU3LTk0NzYtNGMxZC1iOWE4LTZlODgxZjI0NDlkM1wvYnVmZnkydmlsbGUtNC5wbmciLCJvcGFjaXR5Ijo5NSwicHJvcG9ydGlvbnMiOjAuNDUsImdyYXZpdHkiOiJjZW50ZXIifX0.jya8X9yBOdJ7HTblJICR6jFjrKEQKv4ySfaHdcPZuJc")
        thumbs.add("https://cdn.wallpapersafari.com/33/12/U6bmKC.jpg")
        thumbs.add("https://i.pinimg.com/originals/73/b6/9a/73b69af0502031831c904fc536118ce1.jpg")
        thumbs.add("https://oboi-telefon.ru/wallpapers/41100/37910.jpg")
        thumbs.add("https://images.pexels.com/photos/2486168/pexels-photo-2486168.jpeg?cs=srgb&dl=pexels-roberto-nickson-2486168.jpg&fm=jpg")
        thumbs.add("https://trashbox.ru/ifiles/1165264_73c085_screenshot_16.png-orig/4k-wallpapers-expert-android-23.jpg")

        binding.apply {
            recyclerView.adapter = WallPaperAdapter(this@MainActivity, thumbs)
        }

    }

}

