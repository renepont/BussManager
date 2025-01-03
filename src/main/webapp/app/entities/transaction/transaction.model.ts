import dayjs from 'dayjs/esm';
import { ICompany } from 'app/entities/company/company.model';
import { TransactionType } from 'app/entities/enumerations/transaction-type.model';

export interface ITransaction {
  id: number;
  value?: number | null;
  date?: dayjs.Dayjs | null;
  type?: keyof typeof TransactionType | null;
  company?: Pick<ICompany, 'id'> | null;
}

export type NewTransaction = Omit<ITransaction, 'id'> & { id: null };
