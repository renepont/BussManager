import { ICompany, NewCompany } from './company.model';

export const sampleWithRequiredData: ICompany = {
  id: 6800,
  name: 'reschedule ah',
  nif: 18835,
};

export const sampleWithPartialData: ICompany = {
  id: 6304,
  name: 'qua inure of',
  nif: 15811,
};

export const sampleWithFullData: ICompany = {
  id: 14111,
  name: 'clean',
  nif: 6237,
};

export const sampleWithNewData: NewCompany = {
  name: 'forenenst haze',
  nif: 29052,
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
