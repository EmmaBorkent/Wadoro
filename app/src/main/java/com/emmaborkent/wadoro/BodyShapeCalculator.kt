package com.emmaborkent.wadoro

class BodyShapeCalculator(shoulders: Double, bust: Double, waist: Double, hips: Double) {

    fun calculateBodyShape(shoulders: Double, bust: Double, waist: Double, hips: Double): BodyShape {
        // TODO: 23-10-2020 Implement test method two and three as part of the return type
        return measuringMethodOne(bust, waist, hips)
    }

    private fun measuringMethodOne(bust: Double, waist: Double, hips: Double): BodyShape {
        // Determine your body shape using your bust, waist, and hip measurements.

        val isRectangleBodyShape = calculateRectangleBodyShape(bust, waist, hips)
        val isPearBodyShape = calculatePearBodyShape(bust, waist, hips)
        val isInvertedTriangleBodyShape = calculateInvertedTriangleBodyShape(bust, waist, hips)
        val isHourglassBodyShape = calculateHourglassBodyShape(bust, waist, hips)
        val isAppleBodyShape = calculateAppleBodyShape(bust, waist, hips)

        return when {
            isRectangleBodyShape -> BodyShape.RECTANGLE
            isPearBodyShape -> BodyShape.PEAR
            isInvertedTriangleBodyShape -> BodyShape.INVERTED_TRIANGLE
            isHourglassBodyShape -> BodyShape.HOURGLASS
            isAppleBodyShape -> BodyShape.APPLE
            else -> throw IllegalArgumentException("Body Shape could not be determined")
        }
    }

    private fun measuringMethodTwo(shoulders: Double, waist: Double, hips: Double): BodyShape {
        // Determine your body shape using your shoulder, waist, and hip measurements.
        return BodyShape.RECTANGLE // TODO: 23-10-2020 Implement measuring method two
    }

    private fun measuringMethodThree() {
        // Look in the mirror and determine which parts of your body are out of balance with the rest of the body.
        // TODO: 23-10-2020 Implement measuring method three
    }

    private fun calculateRectangleBodyShape(top: Double, waist: Double, hips: Double): Boolean {
        // top and hips will be within 5% of each other
        // AND waist will be less than 25% smaller than top
        
        return if (top > hips) {
            if (hips >= withinFivePercentOf(top)) {
                waistLessThanTwentyFivePercentThanTop(waist, top)
            } else false
        } else if (hips > top) {
            if (top >= withinFivePercentOf(hips)) {
                waistLessThanTwentyFivePercentThanTop(waist, top)
            } else false
        } else {
            waistLessThanTwentyFivePercentThanTop(waist, top)
        }
    }

    private fun waistLessThanTwentyFivePercentThanTop(waist: Double, top: Double): Boolean {
        return waist < withingTwentyFivePercentOf(top)
    }

    private fun calculatePearBodyShape(top: Double, waist: Double, hips: Double): Boolean {
        return true // TODO: 23-10-2020 Implement calculate pear body shape
    }

    private fun calculateInvertedTriangleBodyShape(top: Double, waist: Double, hips: Double): Boolean {
        return true // TODO: 23-10-2020 Implement calculate inverted triangle body shape
    }

    private fun calculateHourglassBodyShape(top: Double, waist: Double, hips: Double): Boolean {
        return true // TODO: 23-10-2020 Implement calculate hourglass body shape
    }

    private fun calculateAppleBodyShape(top: Double, waist: Double, hips: Double): Boolean {
        return true // TODO: 23-10-2020 Implement calculate apple body shape
    }
    
    private fun withinFivePercentOf(measurement: Double): Double {
        return measurement-(measurement*0.05)
    }

    private fun withingTwentyFivePercentOf(measurement: Double): Double {
        return measurement-(measurement*0.25)
    }

}