package com.emmaborkent.wadoro

import org.junit.Test

class BodyShapeCalculatorTest {

    @Test
    fun testBodyShapeIsRectangle() {
        val shoulders = 88.5
        val bust = 86.0
        val waist = 66.0
        val hips = 77.0
        val bodyShapeCalculator = BodyShapeCalculator(shoulders, bust, waist, hips)
        val bodyShape = bodyShapeCalculator.calculateBodyShape(shoulders, bust, waist, hips)
    }

}