package org.mobileeye.ai.objects;

import java.util.List;

/**
 * 
 * @author Aakash
 *
 * @param <S> data type of the Scene where object recognition is performed (Image for example)
 * @param <O> data type of the objects that are recognized (Image for example)
 */
public interface ObjectRecognition<S,O> {
	List<RecognizedObject<O>> recognizeObjects(S scene);
}
