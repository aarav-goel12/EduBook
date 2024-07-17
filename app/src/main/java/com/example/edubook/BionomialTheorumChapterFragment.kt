package com.example.edubook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView

class BionomialTheorumChapterFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_bionomial_theorum_chapter, container, false)
        val youTubePlayerView = view?.findViewById<YouTubePlayerView>(R.id.youtube_player_view);
        if (youTubePlayerView != null) {
            lifecycle.addObserver(youTubePlayerView)
        }

        if (youTubePlayerView != null) {
            youTubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
                override fun onReady(youTubePlayer: YouTubePlayer) {
                    val videoId = "MDaHBKx1IyE"
                    youTubePlayer.loadVideo(videoId, 0F)
                }
            })
        }
        return view
    }
}