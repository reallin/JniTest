LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_SRC_FILES := src/main/cpp/hello.cpp

LOCAL_MODULE := hello

include $(BUILD_SHARED_LIBRARY)