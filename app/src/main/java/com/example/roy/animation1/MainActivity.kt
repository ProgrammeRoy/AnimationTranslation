package com.example.roy.animation1

import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.BounceInterpolator
import android.view.animation.LinearInterpolator
import android.view.animation.OvershootInterpolator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvTanslationY.setOnClickListener {
            animateTanslationY()
        }

        tvTanslationX.setOnClickListener {
            animateTanslationX()
        }
        tvTanslationZ.setOnClickListener {
            animateTanslationZ()
        }
        button.setOnClickListener {
            showAnimate()
        }

        btnObject.setOnClickListener {
            showAnimateObject()
        }
    }

    private fun animateTanslationY(){

        //val animator = ValueAnimator.ofFloat(textView1.height.toFloat(),0f)
        val animator = ValueAnimator.ofFloat(300f,0f)
        animator.duration = 1000
        animator.start()

        animator.addUpdateListener { updateAnimator ->
            val animatedValue = updateAnimator.animatedValue as Float
            tvTanslationY.translationY = animatedValue
            tvTanslationY.translationX = animatedValue
        }
    }

    private fun animateTanslationX(){

        //val animator = ValueAnimator.ofFloat(textView1.height.toFloat(),0f)
        val animator = ValueAnimator.ofFloat(300f,0f)
        animator.duration = 1000
        animator.start()

        animator.addUpdateListener { updateAnimator ->
            val animatedValue = updateAnimator.animatedValue as Float
            tvTanslationX.translationX = animatedValue
        }
    }

    private fun animateTanslationZ(){

        //val animator = ValueAnimator.ofFloat(textView1.height.toFloat(),0f)
        val animator = ValueAnimator.ofFloat(300f,0f)
        animator.duration = 1000
        animator.start()

        animator.addUpdateListener { updateAnimator ->
            val animatedValue = updateAnimator.animatedValue as Float
            tvTanslationZ.translationZ = animatedValue
        }
    }

    private fun showAnimate(){
        val animator = ValueAnimator.ofFloat(-200f,0f)
        animator.duration = 1000
        animator.start()

        animator.addUpdateListener { updateAnimator ->
            val animatedValue = updateAnimator.animatedValue as Float
            animator.interpolator = BounceInterpolator()
            button.translationY = animatedValue
        }
    }

    private fun showAnimateObject(){
        val animator = ObjectAnimator.ofFloat(btnObject,"translationX",500f,0f)
        animator.interpolator = OvershootInterpolator()
        animator.duration = 1000
        animator.start()
    }


}
