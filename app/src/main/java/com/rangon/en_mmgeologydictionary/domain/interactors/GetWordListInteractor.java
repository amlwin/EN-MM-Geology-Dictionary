package com.rangon.en_mmgeologydictionary.domain.interactors;

import com.rangon.en_mmgeologydictionary.domain.interactors.base.Interactor;
import com.rangon.en_mmgeologydictionary.model.Word;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by win on 9/10/17.
 */

public interface GetWordListInteractor extends Interactor {
    interface Callback {
        void onWordListRetrieved(Observable<List<Word>> wordListObservable);
    }
}
