export interface ICompany {
  id: number;
  name?: string | null;
  nif?: number | null;
}

export type NewCompany = Omit<ICompany, 'id'> & { id: null };
