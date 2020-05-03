package com.example.simpleplayer

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
/*import com.google.android.exoplayer2.ExoPlaybackException
import com.google.android.exoplayer2.ExoPlayerFactory
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.source.MediaSource
import com.google.android.exoplayer2.source.ProgressiveMediaSource
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector
import com.google.android.exoplayer2.trackselection.TrackSelector
import com.google.android.exoplayer2.ui.PlayerView
import com.google.android.exoplayer2.upstream.DataSource
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
import com.google.android.exoplayer2.util.Util*/

class NewPlayerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_player)

        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)

       window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)

        //val playerView:PlayerView=findViewById(R.id.simplePw)
        //setPlayer(playerView)
    }

  /*  fun setPlayer(pw:PlayerView)
    {
        val trackSelector:TrackSelector=DefaultTrackSelector()
        val simpleExoPlayer:SimpleExoPlayer=ExoPlayerFactory.newSimpleInstance(this,trackSelector)
        val daFactory:DataSource.Factory=DefaultDataSourceFactory(this, Util.getUserAgent(this,"EXOPlayer"))
        val uri:Uri=Uri.parse("http://5.160.10.54:1010")
        val mediaSource:MediaSource=ProgressiveMediaSource.Factory(daFactory)
                .createMediaSource(uri)

        pw.setPlayer(simpleExoPlayer)
        simpleExoPlayer.prepare(mediaSource)
        simpleExoPlayer.setPlayWhenReady(true)

        simpleExoPlayer.addListener(object:Player.EventListener
        {
            override fun onPlayerError(error: ExoPlaybackException?) {
                super.onPlayerError(error)
                println(error?.message)
            }
        })

    }*/
}
