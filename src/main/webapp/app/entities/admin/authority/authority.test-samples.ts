import { IAuthority, NewAuthority } from './authority.model';

export const sampleWithRequiredData: IAuthority = {
  name: '4d169ac3-0cf3-4ca2-9b75-fd6d3796c8c1',
};

export const sampleWithPartialData: IAuthority = {
  name: '315f6dc5-0678-4931-b2b3-691a64b73629',
};

export const sampleWithFullData: IAuthority = {
  name: 'ab32bcbd-efd9-4b6f-8e15-1d779af425e4',
};

export const sampleWithNewData: NewAuthority = {
  name: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
