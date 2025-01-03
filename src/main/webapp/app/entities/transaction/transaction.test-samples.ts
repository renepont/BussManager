import dayjs from 'dayjs/esm';

import { ITransaction, NewTransaction } from './transaction.model';

export const sampleWithRequiredData: ITransaction = {
  id: 3793,
  value: 26806.36,
  date: dayjs('2025-01-02'),
  type: 'EXPENSE',
};

export const sampleWithPartialData: ITransaction = {
  id: 21074,
  value: 9395.75,
  date: dayjs('2025-01-03'),
  type: 'INCOME',
};

export const sampleWithFullData: ITransaction = {
  id: 20285,
  value: 600.71,
  date: dayjs('2025-01-03'),
  type: 'EXPENSE',
};

export const sampleWithNewData: NewTransaction = {
  value: 22341.83,
  date: dayjs('2025-01-03'),
  type: 'EXPENSE',
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
