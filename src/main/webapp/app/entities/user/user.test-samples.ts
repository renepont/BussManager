import { IUser } from './user.model';

export const sampleWithRequiredData: IUser = {
  id: 4313,
  login: '@',
};

export const sampleWithPartialData: IUser = {
  id: 31250,
  login: '7ncM@wkw1dR\\\\xrrr\\AeC\\SuPqkid\\1RD9E\\dfVBnT',
};

export const sampleWithFullData: IUser = {
  id: 27343,
  login: '*ObE@cEiFb9\\.P4OnKJ\\{ZTotm\\NObv4zN\\KOO\\78g',
};
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
