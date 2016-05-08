#
# i386/Linux configuration
#
if test x"$with_threads" = x"unix-pthreads" ; then
	CPPFLAGS="$CPPFLAGS -D_REENTRANT"
fi

# if we use cross environment, following values may not be detected.
if [ "$cross_compiling" = yes ]; then
  ac_cv_c_char_unsigned=${ac_cv_c_char_unsigned='no'}
fi
