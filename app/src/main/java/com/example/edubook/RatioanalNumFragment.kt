package com.example.edubook


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView


class RatioanalNumFragment : Fragment() {

    val videoUrl = "https://www.youtube.com/watch?v=iPwrDWQ7hPc"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val view = inflater.inflate(R.layout.fragment_ratioanal_num, container, false)
        val youTubePlayerView = view?.findViewById<YouTubePlayerView>(R.id.youtube_player_view);
        if (youTubePlayerView != null) {
            lifecycle.addObserver(youTubePlayerView)
        }

        if (youTubePlayerView != null) {
            youTubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
                override fun onReady(youTubePlayer: YouTubePlayer) {
                    val videoId = "wswkQxG-Kk8"
                    youTubePlayer.loadVideo(videoId, 0F)
                }
            })
        }
        return view
    }
}