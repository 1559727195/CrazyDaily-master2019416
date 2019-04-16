/*
  Copyright 2017 Sun Jian
  <p>
  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at
  <p>
  http://www.apache.org/licenses/LICENSE-2.0
  <p>
  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */
package com.crazysunj.domain.interactor.note;

import com.crazysunj.domain.entity.note.NoteEntity;
import com.crazysunj.domain.interactor.UseCase;
import com.crazysunj.domain.repository.note.NoteRepository;

import javax.inject.Inject;

import io.reactivex.Flowable;

/**
 * @author: sunjian
 * created on: 2018/10/3 下午6:42
 * description: https://github.com/crazysunj/CrazyDaily
 */
public class NoteGetNoteUseCase extends UseCase<NoteEntity, Void> {
    private final NoteRepository mNoteRepository;

    @Inject
    public NoteGetNoteUseCase(NoteRepository noteRepository) {
        mNoteRepository = noteRepository;
    }

    @Override
    protected Flowable<NoteEntity> buildUseCaseObservable(Void aVoid) {
        return mNoteRepository.getNote();
    }
}
