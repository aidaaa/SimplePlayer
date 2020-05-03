package com.example.simpleplayer

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.exoplayer2.*
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory
import com.google.android.exoplayer2.extractor.ExtractorsFactory
import com.google.android.exoplayer2.source.ExtractorMediaSource
import com.google.android.exoplayer2.source.MediaSource
import com.google.android.exoplayer2.source.TrackGroupArray
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector
import com.google.android.exoplayer2.trackselection.TrackSelectionArray
import com.google.android.exoplayer2.trackselection.TrackSelector
import com.google.android.exoplayer2.ui.SimpleExoPlayerView
import com.google.android.exoplayer2.upstream.DataSource
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
import com.google.android.exoplayer2.util.Util

class OldPlayerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_old_player)

        val pw:SimpleExoPlayerView=findViewById(R.id.simplePw)
        setPlayer(pw)
    }

    fun setPlayer(pw: SimpleExoPlayerView)
    {
        val trackSelector: TrackSelector = DefaultTrackSelector()
        val loadControl: LoadControl=DefaultLoadControl()
        val simpleExoPlayer:SimpleExoPlayer= ExoPlayerFactory.newSimpleInstance(this,trackSelector,loadControl)
        val daFactory: DataSource.Factory= DefaultDataSourceFactory(this, Util.getUserAgent(this,"EXOPlayer"))
        val uri: Uri =Uri.parse("http://5.160.10.54:1010")
        val extractorsFactory:ExtractorsFactory=DefaultExtractorsFactory()
        val mediaSource: MediaSource =ExtractorMediaSource(uri,daFactory,extractorsFactory,null,null)

        pw.setPlayer(simpleExoPlayer)

        simpleExoPlayer.prepare(mediaSource)
        simpleExoPlayer.setPlayWhenReady(true)

        simpleExoPlayer.addListener(object : ExoPlayer.EventListener{

            override fun onTracksChanged(
                trackGroups: TrackGroupArray?,
                trackSelections: TrackSelectionArray?
            ) {
            }

            override fun onPlayerError(error: ExoPlaybackException?) {
                println(error?.message)
            }

            override fun onPlayerStateChanged(playWhenReady: Boolean, playbackState: Int) {
            }

            override fun onLoadingChanged(isLoading: Boolean) {
            }

            override fun onPositionDiscontinuity() {
            }

            override fun onTimelineChanged(timeline: Timeline?, manifest: Any?) {
            }
        })
    }
}
