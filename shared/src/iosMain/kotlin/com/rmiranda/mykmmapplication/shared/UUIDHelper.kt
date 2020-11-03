package com.rmiranda.mykmmapplication.shared

import platform.Foundation.NSUUID

/**
 * Created by rodrigomiranda on 11/3/20.
 * Applaudo Studios
 */
actual class UUIDHelper {
    actual fun randomUUID() = NSUUID().UUIDString()
}