package recycler.android.svape.mueblecitos

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.graphics.Point
import android.graphics.Rect
import android.graphics.RectF
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.DecelerateInterpolator
import recycler.android.svape.mueblecitos.databinding.ActivityConstrucBinding

class construc : AppCompatActivity() {

    private var currentAnimator: Animator? = null
    private var shortAnimatorDuration: Int = 0
    private lateinit var binding: ActivityConstrucBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityConstrucBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            val thumb1View: View = iBntPersonal

            iBntPersonal.setOnClickListener {
                zoomImageFromThumb(thumb1View, R.drawable.personal)
            }
        }


        shortAnimatorDuration = resources.getInteger(android.R.integer.config_shortAnimTime)
    }



    private fun zoomImageFromThumb(thumb1View: View, imExpandedPersonal: Int) {

        currentAnimator?.cancel()

        binding.imExpandedPersonal.setImageResource(imExpandedPersonal)

        val startBoundsInt = Rect()
        val finalBoundsInt = Rect()
        val globalOffset = Point()

        thumb1View.getGlobalVisibleRect(startBoundsInt)
        // original ->findViewById<View>(R.id.container)
        binding.container.getGlobalVisibleRect(finalBoundsInt, globalOffset)
        startBoundsInt.offset(-globalOffset.x, -globalOffset.y)
        finalBoundsInt.offset(-globalOffset.x, -globalOffset.y)

        val startBounds = RectF(startBoundsInt)
        val finalBounds = RectF(finalBoundsInt)

        val startScale: Float

        if((finalBounds.width() / finalBounds.height() > startBounds.width() / startBounds.height())) {

            startScale = startBounds.height() / finalBounds.height()
            val startWidth: Float = startScale * finalBounds.width()
            val deltaWidth: Float = (startWidth - startBounds.width()) / 2
            startBounds.left -= deltaWidth.toInt()
            startBounds.bottom += deltaWidth.toInt()

        }else{
            startScale = startBounds.width() / finalBounds.width()
            val startHeight: Float = startScale * finalBounds.height()
            val deltaHeight: Float = (startHeight - startBounds.height()) / 2f
            startBounds.top -= deltaHeight.toInt()
            startBounds.bottom += deltaHeight.toInt()
        }

        thumb1View.alpha = 0f
        val image = binding.imExpandedPersonal
        image.visibility = View.VISIBLE

        image.pivotX = 0f
        image.pivotY = 0f


        currentAnimator = AnimatorSet().apply {
            play(ObjectAnimator.ofFloat(
                image,
                View.X,
                startBounds.left,
                finalBounds.left
            )).apply {
                with(ObjectAnimator.ofFloat(image, View.Y, startBounds.top, finalBounds.top))
                with(ObjectAnimator.ofFloat(image, View.SCALE_X, startScale, 1f))
                with(ObjectAnimator.ofFloat(image, View.SCALE_Y, startScale, 1f))
            }

            duration = shortAnimatorDuration.toLong()
            interpolator = DecelerateInterpolator()
            addListener(object: AnimatorListenerAdapter(){

                override fun onAnimationEnd(animation: Animator?) {
                    currentAnimator = null
                }

                override fun onAnimationCancel(animation: Animator?) {
                    currentAnimator = null
                }
            })
            start()
        }


        image.setOnClickListener{
            currentAnimator?.cancel()

            currentAnimator = AnimatorSet().apply {
                play(ObjectAnimator.ofFloat(image, View.X, startBounds.left)).apply {
                    with(ObjectAnimator.ofFloat(image, View.Y, startBounds.top))
                    with(ObjectAnimator.ofFloat(image, View.SCALE_X, startScale))
                    with(ObjectAnimator.ofFloat(image, View.SCALE_Y, startScale))
                }
                duration = shortAnimatorDuration.toLong()
                interpolator = DecelerateInterpolator()
                addListener(object: AnimatorListenerAdapter(){

                    override fun onAnimationEnd(animation: Animator?) {
                        thumb1View.alpha = 1f
                        image.visibility = View.GONE
                        currentAnimator = null
                    }
                })
                start()
            }
        }
    }
}
        // continued : https://developer.android.com/training/animation/zoom?hl=es-419